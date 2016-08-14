package azb.emojimemory;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Bitmap[] images = new Bitmap[5];
    Boolean[] state = new Boolean[12];
    int lastClick = -1;
    int secondLastClick = -1;
    ImageButton lastClickB;
    ImageButton secondLastClickB;
    ArrayList<IntPair> pairs = new ArrayList<IntPair>();



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntPair martini = new IntPair(0,5);
        pairs.add(martini);
        IntPair taco = new IntPair(8,10);
        pairs.add(taco);
        IntPair steak = new IntPair(1,6);
        pairs.add(steak);
        IntPair wine = new IntPair(2,3);
        pairs.add(wine);
        IntPair pizza = new IntPair(4,11);
        pairs.add(pizza);
        IntPair hotdog = new IntPair(7,9);
        pairs.add(hotdog);



        //configureImageButton();
        ImageButton b0 = (ImageButton) findViewById(R.id.zero);
        b0.setOnClickListener(this);

        ImageButton b1 = (ImageButton) findViewById(R.id.one);
        b1.setOnClickListener(this);

        ImageButton b2 = (ImageButton) findViewById(R.id.two);
        b2.setOnClickListener(this);

        ImageButton b3 = (ImageButton) findViewById(R.id.three);
        b3.setOnClickListener(this);

        ImageButton b4 = (ImageButton) findViewById(R.id.four);
        b4.setOnClickListener(this);

        ImageButton b5 = (ImageButton) findViewById(R.id.five);
        b5.setOnClickListener(this);

        ImageButton b6 = (ImageButton) findViewById(R.id.six);
        b6.setOnClickListener(this);

        ImageButton b7 = (ImageButton) findViewById(R.id.seven);
        b7.setOnClickListener(this);

        ImageButton b8 = (ImageButton) findViewById(R.id.eight);
        b8.setOnClickListener(this);

        ImageButton b9 = (ImageButton) findViewById(R.id.nine);
        b9.setOnClickListener(this);

        ImageButton b10 = (ImageButton) findViewById(R.id.ten);
        b10.setOnClickListener(this);

        ImageButton b11 = (ImageButton) findViewById(R.id.eleven);
        b11.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {

        secondLastClick = lastClick;
        secondLastClickB = lastClickB;

        switch (v.getId()) {

            case R.id.zero:
                // do your code
                ImageButton zero = (ImageButton) findViewById(R.id.zero);
                zero.setImageResource(R.drawable.martini);
                lastClick = 0;
                lastClickB = zero;
                Log.d("TAG", pairs.toString());
                break;

            case R.id.one:
                // do your code
                ImageButton one = (ImageButton) findViewById(R.id.one);
                one.setImageResource(R.drawable.steak);
                lastClick = 1;
                lastClickB = one;
                break;
            case R.id.two:
                // do your code
                ImageButton two = (ImageButton) findViewById(R.id.two);
                two.setImageResource(R.drawable.wine);
                lastClick = 2;
                lastClickB = two;

                break;
            case R.id.three:
                // do your code
                ImageButton three = (ImageButton) findViewById(R.id.three);
                three.setImageResource(R.drawable.wine);
                lastClick = 3;
                lastClickB = three;

                break;

            case R.id.four:
                // do your code
                ImageButton four = (ImageButton) findViewById(R.id.four);
                four.setImageResource(R.drawable.pizza);
                lastClick = 4;
                lastClickB = four;

                break;
            case R.id.five:
                // do your code
                ImageButton five = (ImageButton) findViewById(R.id.five);
                five.setImageResource(R.drawable.martini);
                lastClick = 5;
                lastClickB = five;

                break;
            case R.id.six:
                // do your code
                ImageButton six = (ImageButton) findViewById(R.id.six);
                six.setImageResource(R.drawable.steak);
                lastClick = 6;
                lastClickB = six;

                break;
            case R.id.seven:
                // do your code
                ImageButton seven = (ImageButton) findViewById(R.id.seven);
                seven.setImageResource(R.drawable.hotdog);
                lastClick = 7;
                lastClickB = seven;

                break;

            case R.id.eight:
                // do your code
                ImageButton eight = (ImageButton) findViewById(R.id.eight);
                eight.setImageResource(R.drawable.taco);
                lastClick = 8;
                lastClickB = eight;

                break;
            case R.id.nine:
                // do your code
                ImageButton nine = (ImageButton) findViewById(R.id.nine);
                nine.setImageResource(R.drawable.hotdog);
                lastClick = 9;
                lastClickB = nine;

                break;
            case R.id.ten:
                // do your code
                ImageButton ten = (ImageButton) findViewById(R.id.ten);
                ten.setImageResource(R.drawable.taco);
                lastClick = 10;
                lastClickB = ten;

                break;
            case R.id.eleven:
                // do your code
                ImageButton eleven = (ImageButton) findViewById(R.id.eleven);
                eleven.setImageResource(R.drawable.pizza);
                lastClick = 11;
                lastClickB = eleven;

                break;


            default:
                break;
        }
/*
        if((secondLastClick==5 && lastClick==0)||(secondLastClick==0 && lastClick==5))
        {
            Toast.makeText(MainActivity.this, "You got a match!", Toast.LENGTH_LONG).show();

        }
        */
        //Log.d("TAG",toString(lastClick));
        if (lastClickB != null && secondLastClickB != null) {
            IntPair current = new IntPair(lastClick, secondLastClick);

            for (int i = 0; i < pairs.size(); i++) {
                if (lastClickB != null && secondLastClickB != null) {
                    if (pairs.get(i).equals(current)) {
                        Toast.makeText(MainActivity.this, "You got a match! Your logic is legit", Toast.LENGTH_LONG).show();

                    } else {
                        lastClickB.setImageResource(R.drawable.back);
                        secondLastClickB.setImageResource(R.drawable.back);

                    }

                }
            }
            lastClickB = null;
            secondLastClickB = null;
            lastClick = -1;
            secondLastClick = -1;

        }

    }
}
