package com.example.sqlitedemoapp1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertData extends AppCompatActivity
{
    EditText t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);

        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        t3=(EditText)findViewById(R.id.t3);
    }

    public void addRecord(View view)
    {
        DbManager db=new DbManager(this);

        String res=db.addRecord(t1.getText().toString(),t2.getText().toString(),t3.getText().toString());

        Toast.makeText(this,res,Toast.LENGTH_LONG).show();

        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
}
