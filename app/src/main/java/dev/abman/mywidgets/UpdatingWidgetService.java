package dev.abman.mywidgets;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.os.Build;
import android.widget.RemoteViews;

/**
 * Created by adul on 03/10/17.
 */

public class UpdatingWidgetService extends JobService {

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        AppWidgetManager manager = AppWidgetManager.getInstance(this);

        RemoteViews view = new RemoteViews(getPackageName(), R.layout.bilangan_acak_widget);

        ComponentName theWidget = new ComponentName(this, BilanganAcakWidget.class);

        String lastUpdate = "Random : " + NumberGenerator.Generate(100);

        view.setTextViewText(R.id.appwidget_text, lastUpdate);
        manager.updateAppWidget(theWidget, view);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
