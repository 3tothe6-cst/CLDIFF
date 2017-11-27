package edu.fdu.se.bean;

import java.io.Serializable;
import java.util.Date;

public class AndroidRepoCommit implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.commit_id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private String commitId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.branch_id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private Integer branchId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.branch_name
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private String branchName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.tag_name
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private String tagName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.commit_datetime
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private Date commitDatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.commit_timestamp
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private Date commitTimestamp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column android_repo_commit.issdkfile
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	private Integer issdkfile;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public AndroidRepoCommit(Integer id, String commitId, Integer branchId, String branchName, String tagName,
			Date commitDatetime, Date commitTimestamp, Integer issdkfile) {
		this.id = id;
		this.commitId = commitId;
		this.branchId = branchId;
		this.branchName = branchName;
		this.tagName = tagName;
		this.commitDatetime = commitDatetime;
		this.commitTimestamp = commitTimestamp;
		this.issdkfile = issdkfile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public AndroidRepoCommit() {
		super();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.id
	 * @return  the value of android_repo_commit.id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.id
	 * @param id  the value for android_repo_commit.id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.commit_id
	 * @return  the value of android_repo_commit.commit_id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public String getCommitId() {
		return commitId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.commit_id
	 * @param commitId  the value for android_repo_commit.commit_id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setCommitId(String commitId) {
		this.commitId = commitId == null ? null : commitId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.branch_id
	 * @return  the value of android_repo_commit.branch_id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public Integer getBranchId() {
		return branchId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.branch_id
	 * @param branchId  the value for android_repo_commit.branch_id
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.branch_name
	 * @return  the value of android_repo_commit.branch_name
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.branch_name
	 * @param branchName  the value for android_repo_commit.branch_name
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName == null ? null : branchName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.tag_name
	 * @return  the value of android_repo_commit.tag_name
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.tag_name
	 * @param tagName  the value for android_repo_commit.tag_name
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName == null ? null : tagName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.commit_datetime
	 * @return  the value of android_repo_commit.commit_datetime
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public Date getCommitDatetime() {
		return commitDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.commit_datetime
	 * @param commitDatetime  the value for android_repo_commit.commit_datetime
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setCommitDatetime(Date commitDatetime) {
		this.commitDatetime = commitDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.commit_timestamp
	 * @return  the value of android_repo_commit.commit_timestamp
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public Date getCommitTimestamp() {
		return commitTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.commit_timestamp
	 * @param commitTimestamp  the value for android_repo_commit.commit_timestamp
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setCommitTimestamp(Date commitTimestamp) {
		this.commitTimestamp = commitTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column android_repo_commit.issdkfile
	 * @return  the value of android_repo_commit.issdkfile
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public Integer getIssdkfile() {
		return issdkfile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column android_repo_commit.issdkfile
	 * @param issdkfile  the value for android_repo_commit.issdkfile
	 * @mbg.generated  Sat Nov 25 20:46:05 CST 2017
	 */
	public void setIssdkfile(Integer issdkfile) {
		this.issdkfile = issdkfile;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6055063247177534860L;
}