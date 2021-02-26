package com.springdemo.spdemo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("1", "iOS"),
                new Topic("2","Android"),
                new Topic("3", "fireFox")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public String getTopicByID(String id){
        for(Topic t : topics)
            if(t.id.equals(id))
                return t.name;

        return "404 Error!";
    }

    public void append(Topic topic){
        topics.add(topic);
    }

    public void update(String id, String name) {
        for(Topic t : topics)
            if(t.id.equals(id))
                t.name = name;
    }

    public void del(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
