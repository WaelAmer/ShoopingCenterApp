package DAL.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by A046098 on 25.10.2015.
 */
public class InvoiceEntityPK implements Serializable {
    private int id;
    private int articleId;
    private Timestamp invoiceDate;

    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "ArticleID", nullable = false, insertable = true, updatable = true)
    @Id
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Column(name = "InvoiceDate", nullable = false, insertable = true, updatable = true)
    @Id
    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceEntityPK that = (InvoiceEntityPK) o;

        if (id != that.id) return false;
        if (articleId != that.articleId) return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + articleId;
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        return result;
    }
}
