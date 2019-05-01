# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The linux_networking package"
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "linux_networking"
ROS_BPN = "linux_networking"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    access-point-control \
    asmach \
    asmach-tutorials \
    ddwrt-access-point \
    hostapd-access-point \
    ieee80211-channels \
    linksys-access-point \
    multi-interface-roam \
    network-control-tests \
    network-detector \
    network-monitor-udp \
    network-traffic-control \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    access-point-control \
    asmach \
    asmach-tutorials \
    ddwrt-access-point \
    hostapd-access-point \
    ieee80211-channels \
    linksys-access-point \
    multi-interface-roam \
    network-control-tests \
    network-detector \
    network-monitor-udp \
    network-traffic-control \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linux_networking/1.0.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "94b64bac0de7aa9f176d3434024ca474"
SRC_URI[sha256sum] = "a8cdf75617afe3c16004467e3866a5de070a7e6ac7e5a4835be27f2a034e27a6"
S = "${WORKDIR}/linux_networking-release-release-melodic-linux_networking-1.0.13-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('linux-networking', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('linux-networking', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/linux-networking-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}