package com.examzen.unittesting;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;

/**
 * Created by Admin on 8/1/2016.
 */
@RunWith(AndroidJUnit4.class)
public class LongListActivityTest {

    private static final String TEXT_ITEM_30 = "item: 30";

    private static final String TEXT_ITEM_30_SELECTED = "30";

    private static final String TEXT_ITEM_60 = "item: 60";

    // Match the last item by matching its text.
    private static final String LAST_ITEM_ID = "item: 99";

    @Rule
    public ActivityTestRule<LongListActivity> activityTestRule = new ActivityTestRule<>(LongListActivity.class);

    @Test
    public void lastItem_NotDisplayed() {
        onView(withText(LAST_ITEM_ID)).check(doesNotExist());
    }

}
