package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
    }
    @Test
    public void testKlikButtonDua(){
        //cari button2 terus di klik
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
    }
    @Test
    public void testKlikButtonTiga(){
        //cari button3 terus di klik
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }
    @Test
    public void testKlikButtonEmpat(){
        //cari button4 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }
    @Test
    public void testKlikButtonLima(){
        //cari button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }
    @Test
    public void testKlikButtonEnam(){
        //cari button6 terus di klik
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
    }
    @Test
    public void testKlikButtonTujuh(){
        //cari button7 terus di klik
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
    }
    @Test
    public void testKlikButtonDelapan(){
        //cari button8 terus di klik
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("8")));
    }
    @Test
    public void testKlikButtonSembilan(){
        //cari button9 terus di klik
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
    }
    @Test
    public void testKlikButtonNol(){
        //cari button0 terus di klik
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0")));
    }
    @Test
    public void testKlikButtonEqual(){
        //cari buttonEqual terus di klik
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonMulti(){
        //cari buttonMulti terus di klik
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonDivide(){
        //cari buttonDivide terus di klik
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonAdd(){
        //cari buttonAdd terus di klik
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonSub(){
        //cari buttonSub terus di klik
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonClear(){
        //cari buttonClear terus di klik
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("")));
    }
    @Test
    public void testKlikButtonPara1(){
        //cari buttonPara1 terus di klik
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonPara2(){
        //cari buttonPara2 terus di klik
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }
    @Test
    public void testKlikButtonDot(){
        //cari buttonDot terus di klik
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.input)).check(matches(withText(".")));
    }










}
