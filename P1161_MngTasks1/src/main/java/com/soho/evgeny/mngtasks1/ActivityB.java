package com.soho.evgeny.mngtasks1;

import android.content.Intent;
import android.view.View;

/**
 * Created by evgeny on 27.09.16.
 */
public class ActivityB extends MainActivity{
    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, ActivityC.class));
    }
}
