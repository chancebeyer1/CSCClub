package cscclub;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadGPA
{

    public static ArrayList<GPA> readGPA(String fileName) throws IOException
    {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<GPA> result = new ArrayList<>();
        while (true)
        {
            String line = br.readLine();
            if (line == null)
            {
                break;
            }
            String[] attributes = line.trim().split(",");
            double[] gpa = new double[attributes.length - 1];
            for (int i = 1; i < attributes.length; i++)
            {
                double num = ((Integer.parseInt(attributes[i])) / 100) * 4;
                gpa[i-1] = num;
            }
            GPA gpaObject = new GPA(attributes[0], gpa);
            result.add(gpaObject);
        }
        return result;
    }
}
