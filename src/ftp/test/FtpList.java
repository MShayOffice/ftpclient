package ftp.test;

import android.os.Bundle;
import android.widget.EditText;

public class FtpList extends FtpClientActivity {

	private EditText resultText;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.ftplist);
        this.resultText = (EditText)findViewById(R.id.results);
      //  String transfer = "dkghdakgjhsajghjsldhgsf";
      //  resultText.setText(transfer);
      //  displayFolderNames(ftpGetCurrentWorkingDirectory(aFTPClient), resultText);
	}
	
}
