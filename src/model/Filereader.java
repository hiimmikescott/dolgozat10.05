// Szekeres Miklós
// 2023.10.05
// Github : https://github.com/hiimmikescott


package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

        final String Filename = "filbt.txt";
        ArrayList<employee> empList = new ArrayList<>();

        public ArrayList<employee> LoadData(){
            try {
                tryloadData();
            } catch (Exception e) {
                System.err.println("hiba a fájl beolvasásánál");
                System.err.println(e.getMessage());
            }
            return empList;
        }


        public  ArrayList<employee> tryloadData() throws FileNotFoundException {
            File file = new File(Filename);
            Scanner sc = new Scanner(file, "utf-8");

            while (sc.hasNext()) {
                String line = sc.nextLine();
                //System.out.println(line); 70% ig kész
                String [] lineArray = line.split(":");
                employee emp = new employee();
                emp.setNev (lineArray[0]);
                emp.setTelpules (lineArray[1]);
                emp.setCim (lineArray[2]); 
                emp.setSzuletes (lineArray[3]);
                emp.setFizetes (Double.parseDouble(lineArray[4]));
                this.empList.add(emp);   
            }
            sc.close();
            return empList;
        }
    
}
