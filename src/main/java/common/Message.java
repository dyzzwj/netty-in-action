package common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.netty.buffer.ByteBuf;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Message.java
 * @Description TODO
 * @createTime 2020年08月18日 23:40:00
 */
public class Message<T extends MessageBody> {

    private MessageHeader messageHeader;

    private T messageBody;

    public void encode(ByteBuf byteBuf){
        byteBuf.writeInt(messageHeader.getVersion());
        byteBuf.writeInt(messageHeader.getOpCode());
        byteBuf.writeLong(messageHeader.getStreamId());
        byteBuf.writeBytes(JsonUtil.toJson(messageBody).getBytes());
    }
}
