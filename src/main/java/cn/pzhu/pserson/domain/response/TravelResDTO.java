package cn.pzhu.pserson.domain.response;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.sql.Timestamp;

public class TravelResDTO {

    private Integer id;
    private Integer nameid;
    private String wbsid;
    private String name;
    private String project;
    private Timestamp departureTime;
    private Timestamp returnTime;

}
