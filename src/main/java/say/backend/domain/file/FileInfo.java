package say.backend.domain.file;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import say.backend.domain.common.DelYn;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Getter @Setter @Entity
@Table(name = "file_info")
public class FileInfo {
    @Column(name="file_idx")
    @Id
    private String fileIdx;

    @Column(name="original_file_name")
    private String originalFileName;

    @Column(name="file_name")
    private String fileName;

    @Enumerated(EnumType.STRING)
    @Column(name="file_type")
    private FileType fileType;

    @Column(name="save_file_name")
    private String saveFileName;

    @Column(name="reg_dt")
    private LocalDateTime regDt;

    @Column(name="mod_dt")
    private LocalDateTime modDt;

    @ColumnDefault("'N'")
    @Column(name="del_yn")
    private DelYn delYn;
}
