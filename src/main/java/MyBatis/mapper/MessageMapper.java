package MyBatis.mapper;

import MyBatis.model.ChatMessage;
import MyBatis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.logging.log4j.message.Message;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM Messages")
    List<ChatMessage> getAllMessages();

    @Insert("INSERT INTO Messages (username, messagetext) VALUES(#{username}, #{messagetext})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId")
    Integer addMessage(ChatMessage message);

}