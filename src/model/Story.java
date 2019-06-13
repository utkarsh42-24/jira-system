package model;

import java.util.ArrayList;
import java.util.List;

public class Story extends Task {

    private List<Story> stories;


    public Story(TaskType taskType) {
        super(taskType);
        stories = new ArrayList<>();
    }



    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

}
