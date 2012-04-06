package ftp.test;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class FtpList extends FtpClientActivity{

	private TextView buttonList;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.ftplist);
        displayFolderNames(transfer);
        //this.setListAdapter(new ArrayAdapter<String>(this, ftp.test.R.layout.list_item, ftp.test.R.id.label, transfer));
        
        //ListView lv = getListView();
	}
	
	public void displayFolderNames (String[] names)
    {
    	for (int i = 0; i < names.length; i++)
    	{
    		//Button listItem = new Button(this);
    		//listItem.setId(2000 + i);
    		//listItem.setClickable(true);
    		//listItem.setText(names[i]);
    		// listItem[i].setClickable(true);
    	     //   listItem[i].setOnClickListener(new View.OnClickListener() {
    	     //       @Override
    	      //      public void onClick(View v) {
    	       //         // TODO Auto-generated method stub
    	       //         name[i].setText("kjghjbjhb");

    		//buttonList.addView(listItem);
    		//resultText.append(names[i] + "\n");
    	}
    }
}
