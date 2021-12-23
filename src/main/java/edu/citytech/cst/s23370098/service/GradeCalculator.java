package edu.citytech.cst.s23370098.service;

public class GradeCalculator {
    public static float getFinalGrade(float score) {
        float gpa= 0.0f;
        if(score>= 90)
        {
            //Test for score to if it is greater or equal than 90 (Check for A)
            if(score >=90 && score < 93)
            {
                gpa = 3.7f;
            }
            //checks if the score is equals or greater than 93
            else if(score >=93)
            {
                gpa = 4.0f;
            }
        }
        // checks for B, average student
        else if (score >= 80 && score < 90)
        {
            //check for B-
            if(score >=80 && score <83)
            {
                gpa = 2.7f;
            }
            // check for B
            else if(score >=83 && score <87)
            {
                gpa = 3.0f;
            }
            // check for B+
            else if(score >=87 && score <90)
            {

            }gpa = 3.3f;
        }
        // Checks for C, below average student
        else if (score >= 70 && score <79)
        {
            //check for C-
            if(score >=70 && score <73)
            {
                gpa = 1.7f;
            }
            // check for C
            else if(score >=73 && score <77)
            {
                gpa = 2.0f;
            }
            // check for C+
            else if(score >=77 && score <80)
            {
                gpa = 2.3f;
            }
        }

        else if (score >= 65 && score <70)
        {
            //check for D
            if(score >=65 && score <67)
            {
                gpa = 1.0f;
            }
            // check for D-
            else if(score >=67 && score <70)
            {
                gpa = 1.3f;

            }
        }

        else if (score <= 64 )
        {
            gpa = 0.0f;
        }
        return gpa;
    }

    public static String getFinalLetter(float score) {

        String letterGrade = " ";
        if(score>= 90)
        {
            //Test for score to if it is greater or equal than 90 (Check for A)
            if(score >=90 && score < 93)
            {
                letterGrade = "A";
            }
            //checks if the score is equals or greater than 93
            else if(score >=93)
            {

                letterGrade = "A+";
            }
        }
        // checks for B, average student
        else if (score >= 80 && score < 90)
        {
            //check for B-
            if(score >=80 && score <83)
            {
                letterGrade = "B-";
            }
            // check for B
            else if(score >=83 && score <87)
            {
                letterGrade = "B";
            }
            // check for B+
            else if(score >=87 && score <90)
            {
                letterGrade = "B+";
            }
        }
        // Checks for C, below average student
        else if (score >= 70 && score <79)
        {
            //check for C-
            if(score >=70 && score <73)
            {
                letterGrade = "C-";
            }
            // check for C
            else if(score >=73 && score <77)
            {
                letterGrade = "C";
            }
            // check for C+
            else if(score >=77 && score <80)
            {
                letterGrade = "C+";
            }
        }

        else if (score >= 65 && score <70)
        {
            //check for D
            if(score >=65 && score <67)
            {

                letterGrade = "D-";
            }
            // check for D-
            else if(score >=67 && score <70)
            {
                letterGrade = "D+";
            }
        }

        else if (score <= 64 )
        {
            letterGrade = "D+";
        }
        return letterGrade;
    }
}