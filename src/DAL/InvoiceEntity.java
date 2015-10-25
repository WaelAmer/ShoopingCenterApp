package DAL;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * Created by A046098 on 21.10.2015.
 */
@Entity
@Table(name = "Invoice", schema = "dbo", catalog = "ShoopingMarket")
@IdClass(InvoiceEntityPK.class)
public class InvoiceEntity {


    private int id;
    private int articleId;
    private Timestamp invoiceDate;
    private byte[] articleName;
    private BigDecimal articlePrice;
    private int articleCount;
    private BigDecimal articleTotalPrice;
    private ArticleEntity articleByArticleId;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "ArticleID", nullable = false, insertable = true, updatable = true)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Id
    @Column(name = "InvoiceDate", nullable = false, insertable = true, updatable = true)
    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Basic
    @Column(name = "ArticleName", nullable = false, insertable = true, updatable = true)
    public byte[] getArticleName() {
        return articleName;
    }

    public void setArticleName(byte[] articleName) {
        this.articleName = articleName;
    }

    @Basic
    @Column(name = "ArticlePrice", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(BigDecimal articlePrice) {
        this.articlePrice = articlePrice;
    }

    @Basic
    @Column(name = "ArticleCount", nullable = false, insertable = true, updatable = true)
    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    @Basic
    @Column(name = "ArticleTotalPrice", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getArticleTotalPrice() {
        return articleTotalPrice;
    }

    public void setArticleTotalPrice(BigDecimal articleTotalPrice) {
        this.articleTotalPrice = articleTotalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceEntity that = (InvoiceEntity) o;

        if (id != that.id) return false;
        if (articleId != that.articleId) return false;
        if (articleCount != that.articleCount) return false;
        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null) return false;
        if (!Arrays.equals(articleName, that.articleName)) return false;
        if (articlePrice != null ? !articlePrice.equals(that.articlePrice) : that.articlePrice != null) return false;
        if (articleTotalPrice != null ? !articleTotalPrice.equals(that.articleTotalPrice) : that.articleTotalPrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + articleId;
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (articleName != null ? Arrays.hashCode(articleName) : 0);
        result = 31 * result + (articlePrice != null ? articlePrice.hashCode() : 0);
        result = 31 * result + articleCount;
        result = 31 * result + (articleTotalPrice != null ? articleTotalPrice.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ArticleID", referencedColumnName = "ID", nullable = false)
    public ArticleEntity getArticleByArticleId() {
        return articleByArticleId;
    }

    public void setArticleByArticleId(ArticleEntity articleByArticleId) {
        this.articleByArticleId = articleByArticleId;
    }
}
