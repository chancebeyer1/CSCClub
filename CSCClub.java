package cscclub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CSCClub 
{
    public static void main(String[] args) throws IOException
    {
ArrayList<GPA> g = ReadGPA.readGPA("C:\\Users\\chanc\\OneDrive\\Desktop\\GPA.txt");
System.out.println(Arrays.toString(g.get(0).gpa));
    }

}
