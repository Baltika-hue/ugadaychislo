import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.io.PrintWriter;
import  java.io.File;
public class chislogen implements  interface1{
    @Override
    public int getNumber() {
        Random random = new Random();
        return random.nextInt(100)+1;
    }
}
