package th.go.customs.example.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "fw_role")
@Data
public class FwRoleModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 43683626587153361L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fw_role_id")
	private Long fwRoleId;

	@Column(name = "role_code", length = 25)
	private String roleCode;

	@Column(name = "role_name", length = 25)
	private String roleName;

	@Column(name = "role_description", length = 25)
	private String roleDescription;

	@Column(name = "create_by", length = 25)
	private String createBy;

	@Column(name = "create_date")
	private Date createDate = new Date();

	@Column(name = "update_by", length = 25)
	private String updateBy;

	@Column(name = "update_date")
	private Date updateDate;

}
