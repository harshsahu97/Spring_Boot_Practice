package com.springdemo.spdemo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping ("/topics")
    public List<Topic> x(){
        return topicService.getAllTopics();
    }

    @RequestMapping ("/topic/{id}")
    public String y(@PathVariable String id){
        return topicService.getTopicByID(id);
    }

    @PostMapping (value="/topic")
    public void append(@RequestBody Topic topic){
        topicService.append(topic);
    }

    @PutMapping (value="/topic/{id}")
    public void update(@RequestBody Topic topic, @PathVariable String id){
        topicService.update(topic.id, topic.name);
    }

    @DeleteMapping (value="topic/{id}")
    public void del(@PathVariable String id){
        topicService.del(id);
    }
}
