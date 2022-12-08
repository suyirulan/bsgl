//package com.bs.bsgl.service.impl;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.bs.bsgl.core.domain.poi.StringUtils;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//import org.apache.poi.util.StringUtil;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.jnpc.base.attachments.entity.Attachments;
//import com.jnpc.base.attachments.entity.ProAttachments;
//import com.jnpc.base.attachments.entity.ReturnCode;
//import com.jnpc.base.attachments.util.AttachmentsUtil;
//import com.jnpc.base.syslog.SystemLogger;
//import com.jnpc.bean.FConduitSignange;
//import com.jnpc.bean.FIsolationSignange;
//import com.jnpc.bean.FKksSignange;
//import com.jnpc.bean.FSignange;
//import com.jnpc.bean.FSignangePro;
//import com.jnpc.bean.PageDomain;
//import com.jnpc.bean.ReturnModel;
//import com.jnpc.bean.SaveSignange;
//import com.jnpc.common.DBConnectionManager;
//import com.jnpc.common.HttpClientUtil;
//import com.jnpc.unit.StringUtil;
//import com.jnpc.wfi.bean.ReturnType;
//import com.jnpc.wfi.bean.RootNode;
//
//public class SignangeDataService {
//	private static String ServiceName = "SignangeDataService";
//
//	/**
//	 * @param file
//	 * @param request
//	 * @param response
//	 * @return
//	 */
//	public Map<String, Object> uploadFile(MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
//		Map<String, Object> ret = new HashMap<String, Object>();
//		String gid = "";
//		try {
//			double LIMIT_SIZE = 3.0;// 3MB，单个文件大小不能超过此限制
//			gid = request.getParameter("gid");
//			if (StringUtils.isEmpty(gid)) {
//				ret.put("Type", "E");
//				ret.put("Message", "参数[gid]不能为空！");
//
////				SystemLogger.traceWS(this, gid, "uploadFile", ret.get("Type").toString(), gid, ret);
//				return ret;
//			}
//
//			String originalFilename = "";
//			if (null == file || file.isEmpty()) {
//				ret.put("Type", "E");
//				ret.put("Message", "请选择文件！");
//
////				SystemLogger.traceWS(this, gid, "uploadFile", ret.get("Type").toString(), gid, ret);
//				return ret;
//			} else {
//				originalFilename = file.getOriginalFilename();
//				double fileSize = file.getSize() / 1024.0 / 1024.0;//MB
//				if (fileSize > LIMIT_SIZE) {
//					ret.put("Type", "E");
//					ret.put("Message", "文件[" + originalFilename + "]大小为： " + format3(fileSize) + "MB (单文件大小不能超过： " + LIMIT_SIZE + " MB)！");
//
////					SystemLogger.traceWS(this, gid, "uploadFile", ret.get("Type").toString(), gid, ret);
//					return ret;
//				}
//
//				// 校验文件格式
//				// jpg, jpeg, png, doc, docx, ppt, pptx, txt, pdf, zip
//				String extsRegx = ".+(\\.jpg|\\.jpeg|\\.png|\\.doc|\\.docx|\\.ppt|\\.pptx|\\.txt|\\.pdf|\\.zip)$";
//				if (!originalFilename.trim().toLowerCase().matches(extsRegx)) {
//					ret.put("Type", "E");
//					ret.put("Message", "可上传的文件扩展名为：jpg, jpeg, png, doc, docx, ppt, pptx, txt, pdf, zip！");
//
////					SystemLogger.traceWS(this, gid, "uploadFile", ret.get("Type").toString(), gid, ret);
//					return ret;
//				}
//			}
//
//			String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//			ProAttachments proAttachments = new ProAttachments();
//			proAttachments.setProType("P0185");
//			proAttachments.setFileCategory("999");
//			proAttachments.setProcessID(gid);
//			String signtype = request.getParameter("signtype");
//			signtype = StringUtil.isNull(signtype) ? "0" : signtype.trim();
//			proAttachments.setKey01(signtype);
//			String gateWay01 = request.getParameter("gateWay01");// 流程审批中时，步骤号
//			gateWay01 = (StringUtil.isNull(gateWay01) ? signtype : gateWay01);
//			proAttachments.setKey02(gateWay01);
//			proAttachments.setFileName(originalFilename);
//			Attachments attachments = new Attachments();
//			attachments.setFileContent(file.getBytes());
//			attachments.setFileName(originalFilename);
//			attachments.setFileUpUserId(getCurrentUserID(request));
//			attachments.setFileUpTime(currentDate);
//
//			ReturnCode insert = new AttachmentsUtil().createAttachOrPro(attachments, proAttachments);
//			ret.put("Type", insert.getType());
//			ret.put("Message", insert.getMessage());
//			ret.put("fileId", insert.getFileId());
//			ret.put("id", insert.getId());
//
////			SystemLogger.traceWS(this, gid, "uploadFile", ret.get("Type").toString(), gid, ret);
//			return ret;
//		} catch (Exception e) {
////			SystemLogger.error(this, "uploadFile exception.", e);
//			ret.put("Type", "E");
//			ret.put("Message", "文件上传失败：" + e.getLocalizedMessage());
//
////			SystemLogger.traceWS(this, gid, "uploadFile", ret.get("Type").toString(), gid, ret);
//			return ret;
//		}
//	}
//
//	/**
//	 * 格式为最多为3位小数的字符串
//	 *
//	 * @param number
//	 * @return
//	 */
//	private static String format3(Number number) {
//		return new DecimalFormat("0.0##").format(number);
//	}
//
//	public ResponseEntity<byte[]> downloadFile(HttpServletRequest request, HttpServletResponse response, String fileId) throws Exception {
//		request.setCharacterEncoding("UTF-8");
//		try {
//			Attachments qryAttachs = new AttachmentsUtil().qryAttachs(fileId);
//			HttpHeaders headers = new HttpHeaders();
//			headers.setContentDispositionFormData("attachment", qryAttachs.getFileName());
//			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//			return new ResponseEntity<byte[]>(qryAttachs.getFileContent(), headers, HttpStatus.OK);
//		} catch (Exception e) {
//			SystemLogger.error(this, "downloadFile exception.", e);
//			throw e;
//		}
//	}
//
//	/**
//	 * @param gid
//	 *            表单KEY
//	 * @param id
//	 *            附件ID
//	 * @return
//	 */
//	public Map<String, Object> deleteFile(String gid, String id) {
//		Map<String, Object> ret = new HashMap<String, Object>();
//
//		if (StringUtil.isNull(gid) && StringUtil.isNull(id)) {
//			ret.put("Type", "E");
//			ret.put("Message", "参数[gid]、[id]不能同时为空！");
//		} else {
//			if (StringUtil.isNull(id)) {
//				boolean del = new AttachmentsUtil().deleteProAttach(id, gid, null, null, null);
//				if (del) {
//					ret.put("Type", "S");
//					ret.put("Message", "删除成功！");
//				} else {
//					ret.put("Type", "E");
//					ret.put("Message", "删除失败！");
//				}
//			} else {
//				ReturnCode del = new AttachmentsUtil().deleteFileOfProcessFileAdmin(id);
//				ret.put("Type", del.getType());
//				ret.put("Message", del.getMessage());
//			}
//		}
//
//		SystemLogger.traceWS(this, gid, gid, ret.get("Type").toString(), gid, ret);
//		return ret;
//	}
//
//	/**
//	 * 获取关联的附件列表
//	 *
//	 * @param request
//	 * @param response
//	 * @return
//	 */
//	public List<ProAttachments> getFileLists(String gid) {
//		if (StringUtil.isNull(gid)) {
//			return null;
//		}
//		return new AttachmentsUtil().qryProAttachs(gid, null, null, null);
//	}
//
//	/**
//	 *
//	 * @param gids
//	 *            GID列表
//	 * @param flowno
//	 *            流程流水号
//	 * @param currentStep
//	 *            当前审批节点号
//	 * @return
//	 *
//	 * @author t_zhangwp
//	 * @since Jul 5, 2021 10:29:55 AM, TASK #647
//	 *
//	 */
//	public Map<String, Integer> getFileCount(List<String> gids, String flowno, String currentStep) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		if ((null == gids || gids.isEmpty()) && StringUtil.isNull(flowno)) {
//			return map;
//		}
//
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		try {
//			if(null != gids && !gids.isEmpty()) {
//				StringBuffer buf = new StringBuffer(" SELECT PROCESSID, COUNT(1) AS CT FROM BPM.T_PRO_ATTACHMENTS a WHERE a.PROCESSID IN (?");
//				for (int i = 1; i < gids.size(); i++) {
//					buf.append(",?");
//				}
//				buf.append(") AND (a.DELETEFLG IS NULL OR a.DELETEFLG<>'DEL') ");
//				if (StringUtil.isValid(currentStep)) {
//					buf.append(" AND a.KEY02=? ");
//				}
//				buf.append(" GROUP BY a.PROCESSID ");
//
//				SystemLogger.error(this, "getFileCountByGid(by gids) SQL:\n" + buf.toString());
//				conn = DBConnectionManager.getConnectionBPM();
//				psmt = conn.prepareStatement(buf.toString());
//				int idx = 1;
//				for (String g : gids) {
//					psmt.setString(idx++, g);
//				}
//				if (StringUtil.isValid(currentStep)) {
//					psmt.setString(idx++, currentStep);
//				}
//				rs = psmt.executeQuery();
//				while (rs.next()) {
//					map.put(rs.getString("PROCESSID"), rs.getInt("CT"));
//				}
//			} else {
//				StringBuffer buf = new StringBuffer(" SELECT PROCESSID, COUNT(1) AS CT FROM BPM.T_PRO_ATTACHMENTS a WHERE a.PROCESSID IN ( SELECT GID FROM bpm.JNPC_BSGL_F_SIGNANGE WHERE FLOWNO=?) ");
//				if (StringUtil.isValid(currentStep)) {
//					buf.append(" AND a.KEY02=? ");
//				}
//				buf.append(" GROUP BY a.PROCESSID ");
//
//				SystemLogger.error(this, "getFileCountByGid(by flowno) SQL:\n" + buf);
//				conn = DBConnectionManager.getConnectionBPM();
//				psmt = conn.prepareStatement(buf.toString());
//				psmt.setString(1, flowno);
//				if (StringUtil.isValid(currentStep)) {
//					psmt.setString(2, currentStep);
//				}
//				rs = psmt.executeQuery();
//				while (rs.next()) {
//					map.put(rs.getString("PROCESSID"), rs.getInt("CT"));
//				}
//			}
//			return map;
//		} catch (Exception e) {
//			SystemLogger.error(this, "getFileCountByGid exception.", e);
//			return map;
//		} finally {
//			DBConnectionManager.freeConnection(conn, psmt, rs);
//		}
//	}
//}
