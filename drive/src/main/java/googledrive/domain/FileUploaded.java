package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private String createTime;
    private Long size;
    private Date createTime;
    private String userId;
    private String userId;

    public FileUploaded(File aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
