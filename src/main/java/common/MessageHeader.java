package common;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MessageHeader.java
 * @Description TODO
 * @createTime 2020年08月18日 23:40:00
 */
public class MessageHeader {

    private int version = 1;

    private long streamId;

    private int opCode;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getStreamId() {
        return streamId;
    }

    public void setStreamId(long streamId) {
        this.streamId = streamId;
    }

    public int getOpCode() {
        return opCode;
    }

    public void setOpCode(int opCode) {
        this.opCode = opCode;
    }
}
