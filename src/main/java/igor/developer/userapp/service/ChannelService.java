package igor.developer.userapp.service;

import igor.developer.userapp.model.Channel;
import igor.developer.userapp.model.User;
import igor.developer.userapp.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Optional;

@Service
@EnableWebMvc
public class ChannelService {
    @Autowired
    private ChannelRepository channelRepository;

    public Channel createChannel(Channel channelProfile){
        return channelRepository.save(channelProfile);
    }

    public Channel updateChannel(String id, Channel channelProfile){
        channelProfile.setId(id);
        return channelRepository.save(channelProfile);
    }

    public Channel getChannel(String id)throws Exception{
        Optional<Channel> optionalChannel= channelRepository.findById(id);

        if(!optionalChannel.isPresent())
            throw new Exception("Channel record is nor availiable...");

        return optionalChannel.get();
    }

    public List<Channel> listChannel(){
            return channelRepository.findAll();
    }

    public void deleteChannel(String id){
        channelRepository.deleteById(id);
    }
}
