package db;

import model.Sprint;
import model.Task;
import model.User;

import java.util.HashMap;

public class Database {

    private HashMap<Integer, User> userBase;
    private HashMap<Integer, Sprint> sprintBase;
    private HashMap<Integer, Task> taskBase;

    public Database() {
        userBase = new HashMap<>();
        sprintBase = new HashMap<>();
        taskBase = new HashMap<>();
    }


}
