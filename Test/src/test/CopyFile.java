package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean exitStatusCode = true;

		while (exitStatusCode) {
			File f = new File(
					"C:\\programdata\\McAfee\\Common Framework\\AgentEvents");
			File lf[] = f.listFiles();

			if (lf.length == 0) {
				exitStatusCode = true;
			} else {
				String str[] = new String[lf.length];
				for (int i = 0; i < lf.length; i++) {
					str[i] = lf[i].getName();
					InputStream in = new FileInputStream(lf[i]);

					OutputStream out = new FileOutputStream(new File(
							"C:\\temp\\" + str[i]));

					byte[] buf = new byte[1024];
					int len;
					while ((len = in.read(buf)) > 0) {
						out.write(buf, 0, len);
					}
					in.close();
					out.close();
					System.out.println("File copied.");

				}

				exitStatusCode = false;

			}

		}

	}

}
