package com.example.soc;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import com.example.soc.QuizContract.*;
public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;


    private SQLiteDatabase db;

    public QuizDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE  " +
                QuestionsTable.TABLE_NAME + "(" +
                QuestionsTable._ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                QuestionsTable.COLUMN_QUESTION + "TEXT," +
                QuestionsTable.COLUMN_OPTION1 + "TEXT," +
                QuestionsTable.COLUMN_OPTION2 + "TEXT," +
                QuestionsTable.COLUMN_OPTION3 + "TEXT," +
                QuestionsTable.COLUMN_ANSWER + "INTEGER" +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

private void fillQuestionsTable() {
        Question q1 = new Question("A is correct","A","F","t",1);
    Question q2 = new Question("A is correc","A","F","t",2);
    Question q3 = new Question("A is corre","A","F","t",3);
    Question q4 = new Question("A is corr","A","F","t",1);
    Question q5 = new Question("A is corr","A","F","t",3);
    Question q6 = new Question("A is cor","A","F","t",2);
    Question q7 = new Question("A is co","A","F","t",1);
    Question q8 = new Question("A is c","A","F","t",3);
          }

          private void addQuestion(Question question) {
              ContentValues cv = new ContentValues();
              cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
              cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
              cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
              cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
              cv.put(QuestionsTable.COLUMN_ANSWER, question.getAnswerNr());
              db.insert(QuestionsTable.TABLE_NAME, null, cv);
          }
        }

