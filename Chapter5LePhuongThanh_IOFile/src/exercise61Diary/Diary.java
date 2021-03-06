package exercise61Diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Le Phuong Thanh
 * @Date: 14/09/2016
 * @Version: 1.0
 * @Create Class Diary to readFile and write file
 *
 */
public class Diary {

	private String diary;
	private String date;
	String content;

	public void readFile() throws EOFException {
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/exercise61Diary/daily.txt")))) {
			while (in.available() > 0) {
				date = in.readUTF();
				content = in.readUTF();
				//diary += date + "\n" + content + "\n\n";
				System.out.println(toString());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void writerFile(Diary dairy1) throws FileNotFoundException,
			IOException {
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/exercise61Diary/daily.txt", true)))) {
			out.writeUTF(dairy1.getDate());
			out.writeUTF(dairy1.getContent());
			System.out.println("written is recorded success");
		}

	}

	public String getDiary() {
		return diary;
	}

	public void setDiary(String diary) {
		this.diary = diary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Diary(String diary, String date, String content) {
		super();
		this.diary = diary;
		this.date = date;
		this.content = content;
	}

	public Diary() {
		super();
	}

	@Override
	public String toString() {

		return "Date: " + date + "\nContent: " + content + "\n";
	}

}
