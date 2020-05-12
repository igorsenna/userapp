package igor.developer.userapp.controler;


import igor.developer.userapp.model.Channel;
import igor.developer.userapp.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    @GetMapping("/channels")
    @CrossOrigin
    public List<Channel> listChannel (){
        return channelService.listChannel();
    }

    @GetMapping("/channel/{id}")
    @CrossOrigin
    public Channel getChannel(@PathVariable("id") String id)throws Exception{
        return channelService.getChannel(id);
    }

    @PostMapping("/channel")
    @CrossOrigin
    public Channel createChannel(@RequestBody Channel channelProfile){
        return channelService.createChannel(channelProfile);
    }

    @PutMapping("/channel/{id}")
    @CrossOrigin
    public Channel updateChannel(@PathVariable ("id") String id, @RequestBody Channel channelProfile){
        return channelService.updateChannel(id, channelProfile);
    }

    @DeleteMapping("/channel/{id}")
    @CrossOrigin
    public void deleteChannel(@PathVariable("id") String id){
        channelService.deleteChannel(id);
    }
}
