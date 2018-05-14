package com.acme.tictactoe.view;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.acme.tictactoe.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TicTacToeActivityTest {

    @Rule
    public ActivityTestRule<TicTacToeActivity> mActivityTestRule = new ActivityTestRule<>(TicTacToeActivity.class);

    @Test
    public void ticTacToeActivityTest2() {
        ViewInteraction appCompatButton = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        0),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        1),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        2),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        5),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        4),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        7),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        3),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withText("X"),
                        childAtPosition(
                                allOf(withId(R.id.buttonGrid),
                                        childAtPosition(
                                                withId(R.id.tictactoe),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        6),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.buttonGrid),
                                childAtPosition(
                                        withId(R.id.tictactoe),
                                        0)),
                        8),
                        isDisplayed()));
        appCompatButton10.perform(click());

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
