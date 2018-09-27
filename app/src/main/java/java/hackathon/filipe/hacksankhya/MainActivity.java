package java.hackathon.filipe.hacksankhya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    public static Conversation conversationService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = findViewById(R.id.tv_1);
        editText = findViewById(R.id.edt_1);
        button = findViewById(R.id.btn_1);


    }
}
