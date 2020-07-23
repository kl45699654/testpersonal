package cn.pzhu.pserson.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
@Data
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nameID")
    private Integer nameid;

    @Column(name = "wbsID")
    private String wbsid;

    private String name;

    private String project;

    private Date departureTime;

    @Column(name = "return_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private DateTimeLiteralExpression.DateTime returnTime;

    private Double amount;

//    /**
//     * @return id
//     */
//    public Integer getId() {
//        return id;
//    }
//
//    /**
//     * @param id
//     */
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    /**
//     * @return nameID
//     */
//    public Integer getNameid() {
//        return nameid;
//    }
//
//    /**
//     * @param nameid
//     */
//    public void setNameid(Integer nameid) {
//        this.nameid = nameid;
//    }
//
//    /**
//     * @return wbsID
//     */
//    public String getWbsid() {
//        return wbsid;
//    }
//
//    /**
//     * @param wbsid
//     */
//    public void setWbsid(String wbsid) {
//        this.wbsid = wbsid;
//    }
//
//    /**
//     * @return name
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * @param name
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * @return project
//     */
//    public String getProject() {
//        return project;
//    }
//
//    /**
//     * @param project
//     */
//    public void setProject(String project) {
//        this.project = project;
//    }
//
//    /**
//     * @return departure_time
//     */
//    public Date getDepartureTime() {
//        return departureTime;
//    }
//
//    /**
//     * @param departureTime
//     */
//    public void setDepartureTime(Date departureTime) {
//        this.departureTime = departureTime;
//    }
//
//    /**
//     * @return return_time
//     */
//    public Date getReturnTime() {
//        return returnTime;
//    }
//
//    /**
//     * @param returnTime
//     */
//    public void setReturnTime(Date returnTime) {
//        this.returnTime = returnTime;
//    }
//
//    /**
//     * @return amount
//     */
//    public Double getAmount() {
//        return amount;
//    }
//
//    /**
//     * @param amount
//     */
//    public void setAmount(Double amount) {
//        this.amount = amount;
//    }
}