package com.jt.pojo;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "ttrd_limit_item")
public class LimitItem {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 鎺堜俊缂栧彿
     */
    @Column(name = "LIMIT_NO")
    private String limitNo;

    /**
     * 鎺堜俊绫诲瀷
     */
    @Column(name = "LIMIT_TYPE")
    private Long limitType;

    /**
     * 甯佺?
     */
    @Column(name = "CURRENCY")
    private String currency;

    /**
     * 浜ゆ槗瀵规墜ID
     */
    @Column(name = "PARTY_ID")
    private String partyId;

    /**
     * 鐘舵?
     */
    @Column(name = "STATUS")
    private Short status;

    /**
     * 鍒涘缓鏃堕棿
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 鏈?悗鏇存柊鏃堕棿
     */
    @Column(name = "LAST_MODIFY_TIME")
    private String lastModifyTime;

    /**
     * 鏈?悗鏇存柊浜
     */
    @Column(name = "LAST_MODIFIER")
    private String lastModifier;

    /**
     * 棰勭暀瀛楁?1
     */
    @Column(name = "A1")
    private String a1;

    /**
     * 棰勭暀瀛楁?2
     */
    @Column(name = "A2")
    private String a2;

    /**
     * 棰勭暀瀛楁?3
     */
    @Column(name = "A3")
    private String a3;

    /**
     * 棰勭暀瀛楁?4
     */
    @Column(name = "A4")
    private String a4;

    /**
     * 棰勭暀瀛楁?5
     */
    @Column(name = "A5")
    private String a5;

    /**
     * 鍓嶇疆鏉＄洰id
     */
    @Column(name = "PRE_ITEM_ID")
    private String preItemId;

    /**
     * 鍚庣疆鏉＄洰id
     */
    @Column(name = "POST_ITEM_ID")
    private String postItemId;

    /**
     * 鏄?惁鍒犻櫎鏍囪?0姝ｅ父1鍒犻櫎
     */
    @Column(name = "IS_DELETE")
    private Integer isDelete;

    @Column(name = "MA1")
    private String ma1;

    @Column(name = "MA2")
    private String ma2;

    @Column(name = "MA3")
    private String ma3;

    @Column(name = "MA4")
    private String ma4;

    @Column(name = "MA5")
    private String ma5;

    /**
     * item鍒嗙粍ID
     */
    @Column(name = "ITEM_GRP_ID")
    private Long itemGrpId;

    /**
     * 琚??鐢ㄦ潯鐩甀D(妯℃嫙鍊熺敤鏉＄洰涓婁篃闇??濉?叆)
     */
    @Column(name = "BORROWED_ITEM_ID")
    private Long borrowedItemId;

    /**
     * 鍊熺敤鏉＄洰ID(浠呭湪妯℃嫙鍊熺敤鏉＄洰涓婇渶瑕佸～鍏?
     */
    @Column(name = "BORROW_ITEM_ID")
    private Long borrowItemId;

    /**
     * 鍊熺敤铏氭嫙鏉＄洰ID锛堜粎鍦ㄥ瓙鏉＄洰涓婁繚瀛橈級
     */
    @Column(name = "BORROW_VIRTUAL_ITEM_ID")
    private Long borrowVirtualItemId;

    /**
     * 鍊熺敤鏈?ぇ閲戦?
     */
    @Column(name = "BORROW_MAX_AMOUNT")
    private BigDecimal borrowMaxAmount;

    /**
     * 璐︽埛闆嗗悎锛屽?涓?处鎴蜂箣闂寸敤,闅斿紑
     */
    @Column(name = "SECU_ACCT_IDS")
    private String secuAcctIds;

    /**
     * 澶т簬绛変簬鍖归厤鏉′欢1
     */
    @Column(name = "GTEQ1")
    private String gteq1;
}