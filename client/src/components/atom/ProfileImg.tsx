import { FC } from 'react';
import styled from 'styled-components';
import defaultImg from '../../assets/default.png';

interface ProfileImgProps {
  src?: string;
  width?: string;
}

const ProfileImg: FC<ProfileImgProps> = ({ src = defaultImg, width }) => {
  return <StyledProfileImg src={src} width={width} />;
};

export const StyledProfileImg = styled.img`
  width: ${(props) => props.width || '100px'};
  height: ${(props) => props.width || '100px'};
  border-radius: 100%;
`;

export default ProfileImg;
