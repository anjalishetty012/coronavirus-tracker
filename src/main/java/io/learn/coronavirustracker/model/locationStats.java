package io.learn.coronavirustracker.model;

public class locationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDate;

    public int getDiffFromPrevDate() {
        return diffFromPrevDate;
    }

    public void setDiffFromPrevDate(int diffFromPrevDate) {
        this.diffFromPrevDate = diffFromPrevDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "locationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
