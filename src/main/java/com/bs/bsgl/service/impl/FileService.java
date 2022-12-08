//package com.bs.bsgl.service.impl;
//
//import glory.mes.auth.util.ShiroUtils;
//import glory.mes.repository.SysUserMapper;
//import glory.mes.support.exception.FileException;
//import glory.mes.support.prop.FileProperties;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.codec.binary.Base64;
//import org.apache.commons.io.FilenameUtils;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.UrlResource;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//@Slf4j
//@Service
//public class FileService {
//
//  /** FKks文件 */
//  private static final String CCDFILE = "CCDFile";
//
//  private static final String FILE_PREFIX = "";
//  private static final String FILE_SUFFIX = "";
//  private final SysUserMapper userMapper;
//  private final FileProperties fileProperties;
//  private Path fileLocation;
//
//  public FileService(FileProperties fileProperties, SysUserMapper userMapper) {
//    this.fileProperties = fileProperties;
//    this.userMapper = userMapper;
//  }
//
//  /**
//   * 生成文件
//   *
//   * @param file 文件
//   * @param type 文件类型
//   * @return 生成后文件名称
//   */
//  public String storeFile(MultipartFile file, String type) {
//    setFileLocation(fileProperties, type);
//
//    String extension = FilenameUtils.getExtension(file.getOriginalFilename());
//
//    File uploadFile;
//
//    try {
//      uploadFile =
//          File.createTempFile(FILE_PREFIX, FILE_SUFFIX + "." + extension, fileLocation.toFile());
//
//      Path targetLocation = this.fileLocation.resolve(uploadFile.getName());
//      Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
//
//      return uploadFile.getName();
//    } catch (IOException e) {
//      throw new FileException(
//          "Could not store file " + file.getOriginalFilename() + ". Please try again!", e);
//    }
//  }
//
//  /**
//   * 有用户名为更改 无则为读取图片
//   *
//   * @param picName 图片名称
//   * @param userName 用户名
//   * @return base64图片
//   */
//  public String readToBase64(String picName, String userName) {
//
//    setFileLocation(fileProperties, HEADPICTURE);
//    Path filePath = this.fileLocation.resolve(picName).normalize();
//
//    try {
//      Resource resource = new UrlResource(filePath.toUri());
//      if (resource.exists()) {
//        byte[] data;
//        data = Files.readAllBytes(resource.getFile().toPath());
//        if (!StringUtils.isEmpty(userName)) {
//          userName = ShiroUtils.getUsername();
//          userMapper.updateUserHead(picName, userName);
//        }
//        return "data:image/jpeg;base64," + Base64.encodeBase64String(data);
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//
//    return null;
//  }
//
//  /**
//   * 设置文件路径
//   *
//   * @param fileProperties 配置信息
//   * @param type 文件类型
//   */
//  private void setFileLocation(FileProperties fileProperties, String type) {
//    if (HEADPICTURE.equals(type)) {
//      this.fileLocation =
//          Paths.get(fileProperties.getUploadDir().concat("/").concat(HEADPICTURE))
//              .toAbsolutePath()
//              .normalize();
//    } else if (DOCUMENTFILE.equals(type)) {
//      this.fileLocation =
//          Paths.get(fileProperties.getUploadDir().concat("/").concat(DOCUMENTFILE))
//              .toAbsolutePath()
//              .normalize();
//    } else if (TREATFILE.equals(type)) {
//      this.fileLocation =
//          Paths.get(fileProperties.getUploadDir().concat("/").concat(TREATFILE))
//              .toAbsolutePath()
//              .normalize();
//    } else if (CCDFILE.equals(type)) {
//      this.fileLocation =
//          Paths.get(fileProperties.getUploadDir().concat("/").concat(CCDFILE))
//              .toAbsolutePath()
//              .normalize();
//    } else {
//      this.fileLocation = Paths.get(fileProperties.getUploadDir()).toAbsolutePath().normalize();
//    }
//
//    try {
//      Files.createDirectories(this.fileLocation);
//    } catch (Exception e) {
//      throw new FileException(
//          "Could not create the directory where the uploaded files will be stored", e);
//    }
//  }
//}
