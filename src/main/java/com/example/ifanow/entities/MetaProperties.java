package com.example.ifanow.entities;

/**
 * This class represents the meta data about the event.
 *
 * @author akashverma
 * @version 1.0.0
 */
public class MetaProperties {
    /**
     * the name of bank
     */
    private String bank;

    /**
     * the merchant id
     */
    private Integer merchantId;

    /**
     * The amount of payment done
     */
    private String value;

    /**
     * The mode by which transaction was carried out. e.g. "netbank"
     */
    private String mode;


    //gett sett


    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
