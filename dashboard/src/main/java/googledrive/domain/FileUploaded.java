package googledrive.domain;

import googledrive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private String createTime;
    private Long size;
    private Date createTime;
    private String userId;
    private String userId;
}
