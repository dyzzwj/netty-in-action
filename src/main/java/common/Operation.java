package common;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Operation.java
 * @Description TODO
 * @createTime 2020年08月18日 23:56:00
 */
public abstract class Operation extends MessageBody{


    public abstract OperationResult execute();
}
