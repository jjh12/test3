package com.example.lgnote.test3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lgnote on 2017-05-21.
 */

public class CourseListAdapter extends BaseAdapter{

    private Context context;
    private List<Course> courseList;


    public CourseListAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;

    }

    @Override
    public int getCount() {
        return courseList.size();
    }

    @Override
    public Object getItem(int i) {
        return courseList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, final ViewGroup parent) {
        View v =View.inflate(context, R.layout.course, null);
        TextView courseTitle = (TextView) v.findViewById(R.id.courseTitle);
        TextView courseTime = (TextView) v.findViewById(R.id.courseTime);
        TextView courseProfessor = (TextView) v.findViewById(R.id.courseProfessor);

        courseTitle.setText(courseList.get(i).getCourseTitle());
        courseTime.setText(courseList.get(i).getCourseTime());
        courseProfessor.setText(courseList.get(i).getCourseProfessor());

        v.setTag(courseList.get(i).getCourseID());




        return v;
    }

}
