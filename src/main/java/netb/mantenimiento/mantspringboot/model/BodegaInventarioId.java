/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BodegaInventarioId implements Serializable {

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "dept_id")
    private Integer deptId;

    @Column(name = "bod_id")
    private Integer bodId;

    private BodegaInventarioId() {
    }

    public BodegaInventarioId(Integer prodId, Integer deptId, Integer bodId) {
        this.prodId = prodId;
        this.deptId = deptId;
        this.bodId = bodId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getBodId() {
        return bodId;
    }

    public void setBodId(Integer bodId) {
        this.bodId = bodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BodegaInventarioId that = (BodegaInventarioId) o;
        return Objects.equals(prodId, that.prodId)
                && Objects.equals(bodId, that.bodId) && Objects.equals(deptId, that.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, bodId, deptId);
    }

}
