DESCRIPTION = "Google Cloud Pub/Sub API client library"
HOMEPAGE = "https://github.com/googleapis/python-pubsub"
AUTHOR = "Google LLC"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-google-api-core \
    python3-grpc-google-iam-v1 \
    python3-proto-plus \
"

SRC_URI[sha256sum] = "83bc50c54f669efb924ad21385bc7092fa11f7576eabef3d0b4d7aa8efa90aa6"

PYPI_PACKAGE = "google_cloud_pubsub"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
