// Szekeres Miklós
// 2023.10.05
// Github : https://github.com/hiimmikescott


package controllers;

import model.Filereader;

public class MainController {
    public MainController(){
        new Filereader().LoadData();
    }
}
