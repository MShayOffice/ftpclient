package ftp.test;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FtpList extends FtpClientActivity {

	private EditText resultText;
	public void onCreate(Bundle savedInstanceState, String[] names, TextView view) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.ftplist);
        this.resultText = (EditText)findViewById(R.id.results);
      //  String transfer = "dkghdakgjhsajghjsldhgsf";
      //  resultText.setText(transfer);
      //  displayFolderNames(ftpGetCurrentWorkingDirectory(aFTPClient), resultText);
	}
	
    public void displayFolderNames (String[] names, TextView view)
    {
    	for (int i = 0; i < names.length; i++)
    	{
    		resultText.append(names[i] + "\n");
    	}
    }

	
}
