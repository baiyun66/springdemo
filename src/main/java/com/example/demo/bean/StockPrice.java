package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @author 24629
 * @TableName stock_stockdaydataadd
 */
@TableName(value ="stock_stockdaydataadd")
@Data
public class StockPrice implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Date time;

    /**
     * 
     */
    private BigDecimal open;

    /**
     * 
     */
    private BigDecimal high;

    /**
     * 
     */
    private BigDecimal low;

    /**
     * 
     */
    private BigDecimal close;

    /**
     * 
     */
    private BigDecimal volume;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * 
     */
    private BigDecimal angle1;

    /**
     * 
     */
    private BigDecimal data3;

    /**
     * 
     */
    private BigDecimal angle3;

    /**
     * 
     */
    private BigDecimal data5;

    /**
     * 
     */
    private BigDecimal angle5;

    /**
     * 
     */
    private BigDecimal data7;

    /**
     * 
     */
    private BigDecimal angle7;

    /**
     * 
     */
    private BigDecimal data10;

    /**
     * 
     */
    private BigDecimal angle10;

    /**
     * 
     */
    private BigDecimal data14;

    /**
     * 
     */
    private BigDecimal angle14;

    /**
     * 
     */
    private BigDecimal data20;

    /**
     * 
     */
    private BigDecimal angle20;

    /**
     * 
     */
    private BigDecimal data21;

    /**
     * 
     */
    private BigDecimal angle21;

    /**
     * 
     */
    private BigDecimal avg1210;

    /**
     * 
     */
    private BigDecimal avg2420;

    /**
     * 
     */
    private BigDecimal avg4840;

    /**
     * 
     */
    private String stockIdId;

    /**
     * 
     */
    private BigDecimal data1;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StockPrice other = (StockPrice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getOpen() == null ? other.getOpen() == null : this.getOpen().equals(other.getOpen()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getLow() == null ? other.getLow() == null : this.getLow().equals(other.getLow()))
            && (this.getClose() == null ? other.getClose() == null : this.getClose().equals(other.getClose()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAngle1() == null ? other.getAngle1() == null : this.getAngle1().equals(other.getAngle1()))
            && (this.getData3() == null ? other.getData3() == null : this.getData3().equals(other.getData3()))
            && (this.getAngle3() == null ? other.getAngle3() == null : this.getAngle3().equals(other.getAngle3()))
            && (this.getData5() == null ? other.getData5() == null : this.getData5().equals(other.getData5()))
            && (this.getAngle5() == null ? other.getAngle5() == null : this.getAngle5().equals(other.getAngle5()))
            && (this.getData7() == null ? other.getData7() == null : this.getData7().equals(other.getData7()))
            && (this.getAngle7() == null ? other.getAngle7() == null : this.getAngle7().equals(other.getAngle7()))
            && (this.getData10() == null ? other.getData10() == null : this.getData10().equals(other.getData10()))
            && (this.getAngle10() == null ? other.getAngle10() == null : this.getAngle10().equals(other.getAngle10()))
            && (this.getData14() == null ? other.getData14() == null : this.getData14().equals(other.getData14()))
            && (this.getAngle14() == null ? other.getAngle14() == null : this.getAngle14().equals(other.getAngle14()))
            && (this.getData20() == null ? other.getData20() == null : this.getData20().equals(other.getData20()))
            && (this.getAngle20() == null ? other.getAngle20() == null : this.getAngle20().equals(other.getAngle20()))
            && (this.getData21() == null ? other.getData21() == null : this.getData21().equals(other.getData21()))
            && (this.getAngle21() == null ? other.getAngle21() == null : this.getAngle21().equals(other.getAngle21()))
            && (this.getAvg1210() == null ? other.getAvg1210() == null : this.getAvg1210().equals(other.getAvg1210()))
            && (this.getAvg2420() == null ? other.getAvg2420() == null : this.getAvg2420().equals(other.getAvg2420()))
            && (this.getAvg4840() == null ? other.getAvg4840() == null : this.getAvg4840().equals(other.getAvg4840()))
            && (this.getStockIdId() == null ? other.getStockIdId() == null : this.getStockIdId().equals(other.getStockIdId()))
            && (this.getData1() == null ? other.getData1() == null : this.getData1().equals(other.getData1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getOpen() == null) ? 0 : getOpen().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getLow() == null) ? 0 : getLow().hashCode());
        result = prime * result + ((getClose() == null) ? 0 : getClose().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAngle1() == null) ? 0 : getAngle1().hashCode());
        result = prime * result + ((getData3() == null) ? 0 : getData3().hashCode());
        result = prime * result + ((getAngle3() == null) ? 0 : getAngle3().hashCode());
        result = prime * result + ((getData5() == null) ? 0 : getData5().hashCode());
        result = prime * result + ((getAngle5() == null) ? 0 : getAngle5().hashCode());
        result = prime * result + ((getData7() == null) ? 0 : getData7().hashCode());
        result = prime * result + ((getAngle7() == null) ? 0 : getAngle7().hashCode());
        result = prime * result + ((getData10() == null) ? 0 : getData10().hashCode());
        result = prime * result + ((getAngle10() == null) ? 0 : getAngle10().hashCode());
        result = prime * result + ((getData14() == null) ? 0 : getData14().hashCode());
        result = prime * result + ((getAngle14() == null) ? 0 : getAngle14().hashCode());
        result = prime * result + ((getData20() == null) ? 0 : getData20().hashCode());
        result = prime * result + ((getAngle20() == null) ? 0 : getAngle20().hashCode());
        result = prime * result + ((getData21() == null) ? 0 : getData21().hashCode());
        result = prime * result + ((getAngle21() == null) ? 0 : getAngle21().hashCode());
        result = prime * result + ((getAvg1210() == null) ? 0 : getAvg1210().hashCode());
        result = prime * result + ((getAvg2420() == null) ? 0 : getAvg2420().hashCode());
        result = prime * result + ((getAvg4840() == null) ? 0 : getAvg4840().hashCode());
        result = prime * result + ((getStockIdId() == null) ? 0 : getStockIdId().hashCode());
        result = prime * result + ((getData1() == null) ? 0 : getData1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", open=").append(open);
        sb.append(", high=").append(high);
        sb.append(", low=").append(low);
        sb.append(", close=").append(close);
        sb.append(", volume=").append(volume);
        sb.append(", amount=").append(amount);
        sb.append(", angle1=").append(angle1);
        sb.append(", data3=").append(data3);
        sb.append(", angle3=").append(angle3);
        sb.append(", data5=").append(data5);
        sb.append(", angle5=").append(angle5);
        sb.append(", data7=").append(data7);
        sb.append(", angle7=").append(angle7);
        sb.append(", data10=").append(data10);
        sb.append(", angle10=").append(angle10);
        sb.append(", data14=").append(data14);
        sb.append(", angle14=").append(angle14);
        sb.append(", data20=").append(data20);
        sb.append(", angle20=").append(angle20);
        sb.append(", data21=").append(data21);
        sb.append(", angle21=").append(angle21);
        sb.append(", avg1210=").append(avg1210);
        sb.append(", avg2420=").append(avg2420);
        sb.append(", avg4840=").append(avg4840);
        sb.append(", stockIdId=").append(stockIdId);
        sb.append(", data1=").append(data1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}