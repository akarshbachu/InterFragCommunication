package mgit.interfragcommunication;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager=getSupportFragmentManager();
        FragB f2=(FragB)manager.findFragmentById(R.id.fragment2);
        f2.changeText(data);

    }
}

/*
InterFrag communication through interface as adapter
STEPS
  1)create 2 fragments FragA,FragB
  2)FragA has button
  3)FragB has TextView
  3)Create interface called Communicator
    which has respond method
  4)implement the above created interface in main activity
  5)define ChangeText method in FragB
  6)when button is clicked respond method is called
  7)In respond method get the reference of fragB and setText to changed data

Note  We are not using direct communication between fragments because to achieve reusability
 */