package dio.lab.spring.ip.ipinfo.model;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IpInformation {


    @Id
    String ip;

    String city;

    String region;

    String regionCode;

    String countryCode;

    String countryCodeIso3;

    String countryName;

    String countryCapital;

    String countryTld;

    String continentCode;

    boolean inEu;

    String postal;

    double latitude;

    double longitude;

    String timezone;

    String utcOffset;

    String countryCallingCode;

    String currency;

    String currencyName;

    String languages;

    String asn;

    String org;

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getIp() {
        return ip;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return region;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    public String getRegionCode() {
        return regionCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCodeIso3(String countryCodeIso3) {
        this.countryCodeIso3 = countryCodeIso3;
    }
    public String getCountryCodeIso3() {
        return countryCodeIso3;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }
    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryTld(String countryTld) {
        this.countryTld = countryTld;
    }
    public String getCountryTld() {
        return countryTld;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }
    public String getContinentCode() {
        return continentCode;
    }

    public void setInEu(boolean inEu) {
        this.inEu = inEu;
    }
    public boolean getInEu() {
        return inEu;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }
    public String getPostal() {
        return postal;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLongitude() {
        return longitude;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public String getTimezone() {
        return timezone;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }
    public String getUtcOffset() {
        return utcOffset;
    }

    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }
    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public String getCurrencyName() {
        return currencyName;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
    public String getLanguages() {
        return languages;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }
    public String getAsn() {
        return asn;
    }

    public void setOrg(String org) {
        this.org = org;
    }
    public String getOrg() {
        return org;
    }

}