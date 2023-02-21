package googledrive.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Dashboard_table")
@Data
public class Dashboard {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String filename;
        private String isUpdated;
        private String isIndexed;
        private String videoUrl;
        private String videoUrl;
        private String fileSize;


}
