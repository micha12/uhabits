/*
 * Copyright (C) 2016 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.isoron.uhabits.widgets;

import android.content.*;
import android.support.annotation.*;

import org.isoron.uhabits.models.*;
import org.isoron.uhabits.ui.widgets.*;

public class StreakWidgetProvider extends BaseWidgetProvider
{
    @NonNull
    @Override
    protected BaseWidget getWidgetFromId(@NonNull Context context, int id)
    {
        Habit habit = getHabitFromWidgetId(id);
        return new StreakWidget(context, id, habit);
    }

//        GraphWidgetView widgetView = (GraphWidgetView) view;
//        StreakChart chart = (StreakChart) widgetView.getDataView();
//
//        int color = ColorUtils.getColor(context, habit.getColor());
//
//        // TODO: make this dynamic
//        List<Streak> streaks = habit.getStreaks().getBest(10);
//
//        chart.setColor(color);
//        chart.setStreaks(streaks);
//    }
}